public class VillageRunner {
        public static void main(String[] args) {
            Native native1=new Native(30,40);
            Native native2=new Native(80,100);
            Village village=new Village("Ganesh",1200,new Native[]{native1,native2});
            village.display(new Native[] {native1,native2});
        }
}


