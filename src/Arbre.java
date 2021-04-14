public class Arbre {
    private Noeud racine;
    private int nbAppel;

    public Arbre(Noeud racine) {
        this.racine = racine;
        this.nbAppel = 0;
    }

    int minimax(Noeud noead, int depth, boolean estMax){
        this.nbAppel++;
        if(depth == 0)
            return noead.getValeur();

        if(estMax){
            int maxEval = Integer.MIN_VALUE;
            for(Noeud n : noead.getListeFils()){
                int eval = minimax(n, depth-1, false);
                maxEval = max(maxEval, eval);
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;
            for(Noeud n : noead.getListeFils()){
                int eval = minimax(n, depth-1, true);
                minEval = min(minEval, eval);
            }
            return minEval;
        }
    }

    int alphaBeta(Noeud noead, int depth, int alpha, int beta, boolean estMax){
        this.nbAppel++;
        if(depth == 0)
            return noead.getValeur();

        if(estMax){
            int maxEval = Integer.MIN_VALUE;
            for(Noeud n : noead.getListeFils()){
                int eval = alphaBeta(n, depth-1, alpha, beta,false);
                maxEval = max(maxEval, eval);
                alpha = max(alpha, eval);
                if(beta <= alpha)
                    break;
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;
            for(Noeud n : noead.getListeFils()){
                int eval = alphaBeta(n, depth-1, alpha, beta,true);
                minEval = min(minEval, eval);
                beta = min(beta, eval);
                if (beta <= alpha)
                    break;
            }
            return minEval;
        }
    }

    public Noeud getRacine() {
        return racine;
    }

    int max(int a, int b){
        if(a > b) return a;
        return b;
    }

    int min(int a, int b){
        if(a < b) return a;
        return b;
    }
}
