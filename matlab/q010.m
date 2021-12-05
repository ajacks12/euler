% The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
% Find the sum of all the primes below two million.
% answer = 142913828922

tot=0;
for i=1:2:2000000
    i
    if isprime(i)==1
        tot=tot+i;
    end
end
tot