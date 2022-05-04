# [7,5,1,8,3,6,0,9,4,2] dizisinin Binary-Search-Tree aşamalarını yazınız.

1. 7 kök olsun
2. 5, 7den küçük. Sol alta yazıyoruz.
3. 1, 7den de 5ten de küçük. 5'in son altına yazıyoruz.
4. 8, 7den büyük. 7nin sağ altına yazıyoruz.
5. 3, 7 ve 5ten küçük ama 1den büyük 1in sağ altına yazıyoruz.
6. 6, 7den küçük ama 5ten büyük, 5in sağ altına yazıyoruz.
7. 0, şuana kadar yazdığımız rakamların hepsinden küçük, sırayla kontrol ederek 1in sol altına yazıyoruz.
8. 9, 7den ve 8den büyük, 8in sağ altına yazıyoruz.
9. 4, 7den ve 5ten küçük ama 1 ve 3ten büyük, 3ün sağ altına yazıyoruz.
10. 2, 7den ve 5ten küçük ve 1den büyük ama 3ten küçük, 3ün sol altına yazıyoruz.
```
                                  7
                              5      8
                         1        6     9
                      0     3
                         2     4
```