this was a team colaboration from Harry Johnson 14874030 and Ben Smith STUDENT NUMBER PLEASE BEN

the files are Main.java, Buffer.java, Producer.java, Consumber.java, Constants.java and this readme.txt.

the code can be conpiled using any java IDE, the parameters args[0], args[1], args[2] represent Producwers, Consumers and the Buffer Size respectively

Running result analysis
1. Run your program using 1 producer, 1 consumer, and buffer size 5. Explain your result. 

Output
Starting all Threads concurrently
Producer #9
Buffer at index 0 holds 1924602824  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  

Consumer #10
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  

Explain
the Buffer was so large in never got filled up.

2. Run your program using 5 producer, 5 consumer, and buffer size 1. Explain your result.

Output 
Starting all Threads concurrently
Consumer #16
Array is empty
Buffer at index 0 holds null  

Producer #10
Buffer at index 0 holds -1568971829  

Producer #12
Array is full

Producer #9
Array is full

Consumer #17
Buffer at index 0 holds null  

Consumer #14
Array is empty
Buffer at index 0 holds null  

Consumer #18
Array is empty
Buffer at index 0 holds null  

Consumer #15
Array is empty
Buffer at index 0 holds null  

Producer #11
Buffer at index 0 holds 595816564  

Producer #13
Array is full

Explain 
the buffer is so small that it was constantly fulled up and many producers producers were unable to save to the buffer.

3. Run your program using one producer, 5 consumer, and buffer size 5. Explain your result

Output

Starting all Threads concurrently
Consumer #12
Array is empty
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  

Consumer #10
Array is empty
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  

Consumer #11
Array is empty
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  

Consumer #14
Array is empty
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  

Consumer #13
Array is empty
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  

Producer #9
Buffer at index 0 holds -330531971  Buffer at index 
1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  

Explain
there were too few producers to keep up with all the Consumers, in this call all consumer went unsatisfied and the buffer was never fulled.


4. Run your program using 5 producer, 5 consumer, and buffer size 10. Explain your result. 

Output
Starting all Threads concurrently
Producer #12
Buffer at index 0 holds -866905658  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Producer #13
Buffer at index 0 holds -866905658  Buffer at index 1 holds -1380955180  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Producer #10
Buffer at index 0 holds -866905658  Buffer at index 1 holds -1380955180  Buffer at index 2 holds -1946073850  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Consumer #14
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Consumer #15
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Consumer #16
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Producer #9
Buffer at index 0 holds -1601257692  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Consumer #17
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Consumer #18
Array is empty
Buffer at index 0 holds null  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

Producer #11
Buffer at index 0 holds -1340354506  Buffer at index 1 holds null  Buffer at index 2 holds null  Buffer at index 3 holds null  Buffer at index 4 holds null  Buffer at index 5 holds null  Buffer at index 6 holds null  Buffer at index 7 holds null  Buffer at index 8 holds null  Buffer at index 9 holds null  

explain
the buffer was only fully emptied once and never full. this was wasteful of memory because there is no potential to ever full the buffer.
