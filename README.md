# Exercises Threads-1 Fall  2017


The first 2 assignments can be found in threadsex1 program!

Assignment 1 program.
a, b and c) 

There is no need for synchronization since 2 of the methods dont use any values between them, they are completly seperated. 
the third method has a boolean value wich is both accessed through the main as the thread it self and will need to be made volatile since
the 2 threads dont share the memory of this value. By making it volatile its shared across all threads that use it.

Assignment 2 program.

a) 

one out of 10 times i get uneven numbers.

b)

we have racing conditions in the even class using the only method there. Racing conditions occours because the method is not atomic. If its not atomic it means that multiple threads can access different parts of the method at the same time and cause problems. 

c)

I solved our problem by making the method that had race conditions synchonized. By doing this we ensure that the method can only be accessed by one thread at the time. Using a lock on the method could have been done as well, but that is pretty much the same as making it synchronized.

Assignment 3 program

The UI completly freezes cause there is only one thread running both the ui and the ball method. This means that the ball program runs forever and not ever coming back to the ui.
The way to fix this is by making the ball class a thread and launching it. Now the program has a thread for the ui and a thread for handling the ball making the program work.

---------
ATTENTION, the solutions for the following assignments can be found in the other program folder: startCodeForThreadExercises-master!!
---------

Assignment 4 program

was told not to make this!

Assignment 5 program

I do not get the right results since the different threads all use the same method wich is not atomic. By making this method atomic we ensure that the program comes up with the right number. I put synchronized on the incr method in the turnstilecounter therby making it atomic.

Assignment 6 program

problem is in BankAccountUnsynchronized,java   the methods for transaction is being used by multiple threads messing things up just as the previous assignments. Both methods of making operations atomic has been used, using lock and synchronized.

