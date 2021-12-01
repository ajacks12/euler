% The prime factors of 13195 are 5, 7, 13 and 29.
% What is the largest prime factor of the number 600851475143 ?

a=600851475143;
n=2;
while n<sqrt(a)
    while rem(a,n)==0
         a=a/n;
    end
    n=n+1;
end
a
