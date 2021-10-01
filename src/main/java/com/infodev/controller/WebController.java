package com.infodev.controller;
import com.infodev.dto.SearchDto;
import com.infodev.entities.*;
import com.infodev.repository.*;
import com.infodev.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
public class WebController {
    @Autowired
    private ICandidateadvtcodeService candidateadvtcodeService;

    @Autowired
    private ICandidateadvtnumberService candidateadvtcodenumberService;

  @Autowired
    private IExtraservicesService extraservicesService;

    @Autowired
    private IRmispaymentService rmispaymentService;

    @Autowired
    private ICandidatePaperdetailService candidatepaperdetailsService;

    @Autowired
    private ICandidateagainstadvtService candidateagainstadvtService;

    @Autowired
    private ICandidateService candidateService;

    @Autowired
    private IadvertisementcodeServices advtcodeServices;


    @Autowired
   private CandidateadvtcodeRepository repository;

    @Autowired
    private CandidateadvtnumberRepository candtadvtrepo;

    @Autowired
   private ExtraservicesRepository extraservicestablerepo;

    @Autowired
    RmispaymentlogsRepository rmispaymentlogsRepository;

    @Autowired
    CandidatepaperdetailRepository candidatepaperdetailRepository;

    @Autowired
    private CandidateagainstadvtRepository candidateagainstadvtRepo;

    /* @GetMapping("/")
     public String indexView(Model model){
         return "index";
     }
 */

    @GetMapping("/search")
    public String showSearch(Model model) {
        model.addAttribute("candidateadvtcode", new Candidateappearagainstadvtcode());
        return "search";
    }

    @RequestMapping(value = "/candidateadvtcodeshow", method = RequestMethod.POST)
    public String findRollnoByAdvertisementcode(@ModelAttribute("candidateadvtcode") Candidateappearagainstadvtcode candidateadvtcode, Model model) {
        List<Map<String, Object>> advertisementcode1 = candidateadvtcodeService.findRollnoByAdvertisementcode(candidateadvtcode.getAdvertisementcode());
        model.addAttribute("advertisementcode1", advertisementcode1);
        return "candidateadvtcodedisplay";
    }

    @GetMapping(value = "/delete")
    public String showDeleteone(Model model) {
        model.addAttribute("searchObj", new SearchDto());
        model.addAttribute("candidateadvtcode", new Candidateappearagainstadvtcode());
        model.addAttribute("candidateappeartoadvtnumber", new Candidateappeartoadvtnumber());
        model.addAttribute("extraservice", new Extraservicestable());
        model.addAttribute("rmispaymentlogsservices", new Rmispaymentlogs());
        model.addAttribute("candidatepaperdetail", new Candidatepaperdetail());
        model.addAttribute("candidateagainstadvt", new Candidateagainstadvt());
        model.addAttribute("candidate",new Candidate());
        model.addAttribute("advertisementcode",new Advertisementcode());
        return "delete";

    }

    @RequestMapping(value = "/searchdata", method = RequestMethod.POST)
    public String selectAllByMasterId(@ModelAttribute("searchObj") SearchDto searchDto, Model model) {

        List<Candidateappearagainstadvtcode> selectall = candidateadvtcodeService.selectAllByMasterId(searchDto.getStudentmasterid(), searchDto.getAdvertisementcode());
        model.addAttribute("selectall", selectall);

        List<Candidateappeartoadvtnumber> selectalladvtnumber = candidateadvtcodenumberService.findAllByMasterIdadvtnumber(searchDto.getStudentmasterid(), searchDto.getAdvertisementcode());
        model.addAttribute("selectalladvtnumber", selectalladvtnumber);

      List<Extraservicestable> listExtraservices = extraservicesService.selectAllExtraservices(searchDto.getStudentmasterid(), searchDto.getAdvertisementcode());
       model.addAttribute("listExtraservices", listExtraservices);

        List<Rmispaymentlogs> listRmispaymentlogs = rmispaymentService.selectAllRmisPaymentservices(searchDto.getStudentmasterid(), searchDto.getAdvertisementcode());
        model.addAttribute("listRmispaymentlogs", listRmispaymentlogs);

        List<Candidatepaperdetail> listpaperdetail = candidatepaperdetailsService.selectAllPaperdetailsByMasterId(searchDto.getStudentmasterid(), searchDto.getAdvertisementcode());
        model.addAttribute("listpaperdetail", listpaperdetail);


        List<Candidateagainstadvt> candidateagainstadvtList = candidateagainstadvtService.selectAllCandidateagainstadvt(searchDto.getStudentmasterid(),searchDto.getAdvertisementcode());
        model.addAttribute("candidateagainstadvtList", candidateagainstadvtList);

       List<Candidate> candidateList=candidateService.selectAllCandidateByMasterId(Long.valueOf(searchDto.getStudentmasterid()));
        model.addAttribute("candidateList",candidateList);


        List<Advertisementcode> advtcodeList=advtcodeServices.selectAllAdvtcodeByAdvertisementcode(searchDto.getAdvertisementcode());
        model.addAttribute("advtcodeList",advtcodeList);


        model.addAttribute("searchObj",searchDto);

      /* List<Candidateappearagainstadvtcode> list= candidateadvtcodeService.deleteByMasterId(searchDto.getStudentmasterid(),searchDto.getAdvertisementcode());
      System.out.println(searchDto.getStudentmasterid()+searchDto.getAdvertisementcode());
      */
        return "delete";

    }

         /*
        @RequestMapping(value = "/deleteuser/{studentmasterid}/{advertisementcode}")
        public String deleteAllByMasterId(@PathVariable(name="studentmasterid") String studentmasterid,@PathVariable(name="advertisementcode") String advertisementcode){
            candidateadvtcodeService.deleteByMasterId(studentmasterid,advertisementcode);
            return "delete";
        }*/

    @PostMapping(value ="/deleteuser")
    public String deleteUserByIdAdvt(@ModelAttribute("searchObj") SearchDto searchDto,Model model) {
       Iterable<Candidateappearagainstadvtcode> listcadvt=candidateadvtcodeService.deleteByMasterId(searchDto.getStudentmasterid(),searchDto.getAdvertisementcode());
       Iterable<Candidateappeartoadvtnumber> listcadtadvtnumber=candidateadvtcodenumberService.deleteByMasterIdadvtnumber(searchDto.getStudentmasterid(),searchDto.getAdvertisementcode());
       Iterable<Extraservicestable> listExtraservices=extraservicesService.deleteAllExtraServices(searchDto.getStudentmasterid(),searchDto.getAdvertisementcode());
        Iterable<Rmispaymentlogs> rmispaymentlogs=rmispaymentService.deleteAllRmispaymentlogs(searchDto.getStudentmasterid(),searchDto.getAdvertisementcode());
        Iterable<Candidatepaperdetail> paperdetailList=candidatepaperdetailsService.deleteAllPaperdetails(searchDto.getStudentmasterid(),searchDto.getAdvertisementcode());

        Iterable<Candidateagainstadvt> candidateagainstadvtList = candidateagainstadvtService.deleteAllCandidateagainstadvt(searchDto.getStudentmasterid(),searchDto.getAdvertisementcode());
        model.addAttribute("candidateagainstadvtList", candidateagainstadvtList);
        model.addAttribute("listcadvt",listcadvt);
        model.addAttribute("listcadtadvtnumber",listcadtadvtnumber);
        model.addAttribute("listExtraservices",listExtraservices);
        model.addAttribute("candidateadvtcode", new Candidateappearagainstadvtcode());
        model.addAttribute("candidateappeartoadvtnumber", new Candidateappeartoadvtnumber());
        model.addAttribute("extraservice", new Extraservicestable());

        repository.deleteAll(listcadvt);
        candtadvtrepo.deleteAll(listcadtadvtnumber);
       extraservicestablerepo.deleteAll(listExtraservices);
        rmispaymentlogsRepository.deleteAll(rmispaymentlogs);
        candidatepaperdetailRepository.deleteAll(paperdetailList);
        candidateagainstadvtRepo.deleteAll(candidateagainstadvtList);
        model.addAttribute("searchObj", new SearchDto());
        return "delete";
    }

}