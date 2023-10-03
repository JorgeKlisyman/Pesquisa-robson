

package com.mycompany.pesquisa;


public class Pesquisa {

    public static void main(String[] args) {
        int[] vet = {12, 15, 17, 19, 20, 21, 27, 37};
        int procurado = 13;
        
        int r = buscaSequencial(vet, procurado);
        if(r != -1){
            System.out.println("O elemento " + procurado + " está presente na posição " + (r+1) + " do vetor.");
        } else {
            System.out.println("O elemento " + procurado + " não está presente no vetor.");
        }
        
        
    }
    
    
    public static int buscaSequencial(int[] vet, int procurado) {
        int i;
        boolean achou = false;
        for (i = 0; i < vet.length; i++) {
            if (vet[i] == procurado) {
                achou = true;
                break;
            }
        }
        if (achou == true) {
            return i;     // retorna a posição onde encontrou a chave
        } else {
            return -1;
        }  // retorna -1 indicando que não achou a chave
    }
}
