% By listing the first six prime numbers: 
% 2, 3, 5, 7, 11, and 13, we can see that 
% the 6th prime is 13.
% What is the 10 001st prime number?
% answer = 104743

a=1:10001;
n=1;
for i=1:1000000000
    if isprime(i)==1
        a(n)=i;
        n=n+1;
        if n==10002
            break
        end
    end
    if n==10002
        break
    end
end

a(10001)
