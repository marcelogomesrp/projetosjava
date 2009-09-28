/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package testeboaspraticas;

import java.util.ArrayList;

/**
 *
 * @author marcelo
 */
public class Main {
    private static Usuario user;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {
        System.out.println("Inicio");
        ArrayList<Usuario> users = new ArrayList<Usuario>();
//        try{
        for (int x = 0; x < 1000000; x++) {
            Usuario uu = new Usuario();
            uu.setNome("Array: " + String.valueOf(x));
            uu.setSenha(x);
            users.add(uu);
        }
//        }finally{
//
//            for (int x = 1; x < 99; x++) {
//        //        users.get(x).finalize();
//                //users.set(x, null);
//                users.get(x).finalize();
//                users.remove(x);
//            }
//        }
//        users.clear();
        System.out.println("Parei de usar ");
//        users = null;
//          for (int x = 0; x < 100000; x++) {
//              users.get(x).finalize();
//          }
//            try {
//
//                user = new Usuario();
//                user.setNome("marcelo");
//                user.setSenha(1);
//                 System.out.println("Nome ".concat(user.getNome()));
//
//            } finally {
//                user = null;
//                user.finalize();
//
//            }
//        }
//       System.out.println("Nome nao pode exitir ".concat(user.getNome()));
//    Usuario user2 = new Usuario();
//    try{
//    user2.setSenha(0);
//       System.out.println("Fim");
//       for (user2.setSenha(0); user2.getSenha() < 100; user2.setSenha(user2.getSenha()+1)) {
//
//       }
//    }finally{
////        user2 = null;
//        user2.finalize();
//    }
        Usuario user3 = new Usuario();
//    try{
    user3.setSenha(0);
       System.out.println("Rodando...");
       for (user3.setSenha(0); user3.getSenha() < 100000000; user3.setSenha(user3.getSenha()+1)) {
                    int x = 6* 3 +1;
       }
//    }finally{
////        user3 = null;
//        user3.finalize();
//
//    }
 System.out.println("Fim");

    }

}
