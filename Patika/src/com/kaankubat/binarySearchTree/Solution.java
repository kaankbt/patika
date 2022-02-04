package com.kaankubat.binarySearchTree;

public class Solution {

    /*
    Problem:
    [7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.

    Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

    ____________________________________________________________________________________

Root'un 7 olarak seçildiğini varsayarsak, 7'den sonra gelen 5 sayısı 7'den küçük olduğu için 7'nin sol tarafına child olarak eklenir.

Ardından gelen 1 sayısı 7'den küçüktür bu yüzden sol taraftaki diğer elemanlar ile kıyaslama yapılır ve 1 sayısı 5'den küçük olduğu için 5'in soluna child olarak eklenir

Bir sonraki 8 sayısı root'dan büyük olduğu için root'un hemen sağına eklenir.

Daha sonra 3 sayısı root'dan küçük olduğu için soldaki diğer node'lara bakılır. Önce 5'e bakılır, 5'den de küçük. Sonra 1'e bakılır ve 1'den büyük olduğu için 1'in sağına child olarak eklenir.

Sıradaki 6 sayısı da root'dan küçük olduğu için soldaki node ile yani 5 ile kıyaslandığında 5'den büyük olduğu için 5'in sağına child olarak eklenir.

0 sayısına geldiğimizde 7'den 5'den ve 1'den küçük olduğu için 1'in soluna child olarak eklenir.

9 sayısı root olan 7'den büyüktür, bir sonraki node olan 8'den de büyüktür bu nedenle 8'in sağına child olarak eklenir.

Sırada 4 sayısı var ve root'dan küçük, root'un bir solundaki 5'den de küçük fakat 5'in solu dolu olduğu için bir alt seviyeye inilir ve orada bulunan 1 sayısı ile kıyaslanır. 1'den büyük olduğu için 1'in sağına yazılması gerekir fakat 1'in sağı da doludur. 1'in sağında bulunan sayıyla kıyaslanır yani 3 ile. Bunun sonucunda sayı 3'den büyük olduğu için 3'ün sağına child olarak eklenir.

Dizinin son sayısı olan 2 de aynı şekilde root'dan küçük olduğu için 5 ile kıyaslanır, 5'den küçüktür fakat 5'in solu doludur. Bir alt satırda 1 ile kıyaslanır ve 1'den büyüktür fakat 1'in sağ tarafı doludur. 1'in sağ tarafındaki 3 ile kıyaslanır ve 3'den küçük olduğu için 3'ün soluna child olarak eklenir.

Tüm bu işlemler sonucunda Binary Search Tree


                    7
            5                  8
        1         6                   9

    0       3

2       4

     */
}
