public class main_move {
    public static void main(String[] args) {
        movesector std1 = new movesector();
        movesector std2 = new movesector();

        std1.setValue(1);
        std2.setValue(2);

        std1.setSub();
        std2.setSub();

        std1.Compro( std1.getID() , std2.getID() , std1.getComp() , std2.getComp() ,std1.getGrade1(), 
        std2.getGrade1(), std1.getGrade2(), std2.getGrade2(), std1.getGrade3(), std2.getGrade3());

    }
}

