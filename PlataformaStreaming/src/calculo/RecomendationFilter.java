package calculo;

public class RecomendationFilter {

    public static void filter(Classifiable classifiable){
        if (classifiable.getClassification() >= 4){
            System.out.println("Esta entre os preferidos do momento ");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        }else {
            System.out.println("Coloque na sua lista para entender depois");
        }
    }
}
