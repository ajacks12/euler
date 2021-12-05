% 2520 is the smallest number that can be divided by 
% each of the numbers from 1 to 10 without any remainder.
% What is the smallest positive number that is 
% evenly divisible by all of the numbers from 1 to 20?
% answer=232792560

##p=[2 3 5 7 11 13 17 19]
##for a=1:20
##    a=a./p;
##end
##n

##THIS TAKES TOO LONG
n=0;
stop=false;
while !stop
  n=n+380;
  stop = all(mod(n, [11 12 13 14 15 16 17 18 19 20])==0);   
end
n


##Only acually needs to be divisble by these (10)
##6
##7
##8
##9
##10
##
##For 20
##11
##12
##13
##14
##15
##16
##17
##18
##19
##20