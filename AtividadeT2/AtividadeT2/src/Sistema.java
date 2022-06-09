import java.util.List;
import java.util.ArrayList;

public class Sistema {
    public static void run(){
        
        List<Membro> membros = new ArrayList<Membro>();
        membros.add(new BigBrothers("B47m4N", "batman@gmai.com", EnumFuncao.BIGBROTHERS, EnumHora.REGULAR));
        membros.add(new ScriptGuys("R0b1n", "robin@gmai.com", EnumFuncao.SCRIPTGUYS, EnumHora.REGULAR));
        membros.add(new MobileMembers("z0d", "z0d@gmai.com", EnumFuncao.MOBILEMEMBERS, EnumHora.REGULAR));
        membros.add(new HeavyLifters("Mas73rCh13f", "mcc@gmai.com", EnumFuncao.HEAVYLIFTERS, EnumHora.REGULAR));

        for(Membro membro : membros){
            membro.postarMensagem();
            membro.setHora(EnumHora.EXTRAS);
            membro.postarMensagem();
            System.out.println("\n");
            membro.setHora(EnumHora.REGULAR);
        }
        
        for(Membro membro : membros){
            if(membro.getFuncao() == EnumFuncao.HEAVYLIFTERS){
                membros.remove(membro);
                break;
            }
        }

        for(Membro membro : membros){
            if(membro.getFuncao() == EnumFuncao.SCRIPTGUYS){
                membros.remove(membro);
                break;
            }
        }
        for(Membro membro : membros){
            membro.postarMensagem();
            System.out.println("\n");
        }

        System.out.println("Sistema encerrando...");
    }
}
