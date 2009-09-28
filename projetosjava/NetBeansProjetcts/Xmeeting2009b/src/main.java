
import br.usp.fmrp.entidades.Member1;
import br.usp.fmrp.entidades.Paper;
import br.usp.fmrp.entidades.Trabalho;
import br.usp.fmrp.service.Member1Service;
import br.usp.fmrp.service.PaperService;
import br.usp.fmrp.service.TrabalhoService;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Member1Service member1Service   = new Member1Service();
        Member1 mb = member1Service.findById(1);
        System.out.println("Member: " + mb.getName());
        mb.setName("Wilson Araújo da Silva Junior");
        member1Service.atualiza(mb);

//        PaperService paperService       = new PaperService();
//        TrabalhoService trabalhoService = new TrabalhoService();
//
//        for(Paper paper:paperService.findAll()){
//            System.out.println(paper.getFilename());
//            System.out.println(paper.getMemberId());
//            System.out.println(member1Service.findById(paper.getMemberId()).getName());
//            System.out.println("------------------------------");
//        }


//        Collection teste = member1Service.findAll();
//          for(Member1 member1:member1Service.findAll()){
//           // System.out.println("*************************************************************");
//            System.out.print("ID: ".concat(String.valueOf(member1.getId())));
//            System.out.println("\tNome: ".concat(member1.getName()));
//           // System.out.println("---------------------------------------");
//          }


//        for(Member1 member1:member1Service.findAll()){
//            System.out.println("*************************************************************");
//            System.out.println("ID: ".concat(String.valueOf(member1.getId())));
//            System.out.println("Nome: ".concat(member1.getName()));
//            System.out.println("---------------------------------------");
//
//            Collection<Paper> papers;
//            papers = paperService.listPaperbyMemberId(member1.getId());
//
//
//            System.out.println("Qtd de paper: " + papers.size());
//
//            if(papers.size() < 1 ){
//                System.out.println("\tSem paper");
//            }else {
//                for(Paper paper:papers){
//                    System.out.println("\tPaper: ".concat(paper.getFilename()));
//                }
//            }
//
//            Collection<Trabalho> trabalhos;
//            trabalhos = trabalhoService.listTrabalhosbyMemberId(member1.getId());
//
//            System.out.println("Qtd de trabalho: " + trabalhos.size());
//            if(trabalhos.size() < 1){
//                System.out.println("\tSem trabalho");
//            }else {
//                for(Trabalho trabalho:trabalhos){
//                    System.out.println("Trabalho: ".concat(trabalho.getTitulo()));
//                }
//            }
//
//        }
    }

}
