% There exists exactly one Pythagorean triplet for 
% which a + b + c = 1000.
% Find the product abc.
% a < b < c
% answer = 31875000

for a=1:600
    for b=1:600
        c=sqrt(a.^2+b.^2);
        if a+b+c==1000;
            a1=a;
            b1=b;
            c1=c;
            break
        end
    end
end

a1*b1*c1