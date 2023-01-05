public class Damier {
    private Case[][] tableau;

    public Damier(){
        this.tableau = new Case[10][10];
    }
    public Damier(Case[][] tableau) {
        this.tableau = tableau;
    }

    public Case[][] getTableau() {
        return tableau;
    }

    public void setTableau(Case[][] tableau) {
        this.tableau = tableau;
    }

    public void initDamier(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                this.tableau[i][j] = new Case();
            }
        }
    }
}
