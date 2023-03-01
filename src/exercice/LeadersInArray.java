/**
 * Écrivez un programme pour imprimer tous les LEADERS du tableau. Un élément est un leader s'il est supérieur à tous les éléments à sa droite.
 * Et l'élément le plus à droite est toujours un leader.
 *
 * Par exemple:
 *
 * Input: arr[] = {16, 17, 4, 3, 5, 2},
 * Output: 17, 5, 2
 *
 * Input: arr[] = {1, 2, 3, 4, 5, 2},
 * Output: 5, 2
 *
 *
 * Approche naïve : le problème peut être résolu en se basant sur l'idée mentionnée ci-dessous :
 *
 * Utilisez deux boucles. La boucle externe va de 0 à la taille - 1 et un par un, sélectionnez tous les éléments de gauche à droite.
 * La boucle interne compare l'élément sélectionné à tous les éléments sur son côté droit.
 * Si l'élément sélectionné est supérieur à tous les éléments à sa droite, alors l'élément sélectionné est le leader.
 *
 * Suivez les étapes ci-dessous pour mettre en œuvre l'idée :
 *
 * Nous exécutons une boucle du premier index à l'avant-dernier index.
 * Et pour chaque index, nous exécutons une autre boucle de l'index suivant au dernier index.
 * Si toutes les valeurs à droite de cet index sont plus petites que l'index, nous ajoutons simplement la valeur dans notre structure
 * de données de réponse.
 */

package exercice;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> leaders = new ArrayList<>();

        int max_so_far = Integer.MIN_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max_so_far) {
                leaders.add(arr[i]);
                max_so_far = arr[i];
            }
        }

        Collections.reverse(leaders);

        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }
}
