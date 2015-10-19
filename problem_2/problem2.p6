#!/usr/local/bin/perl6

my @fib = 0, 1, *+* ... *;

my $counter = 0;
my $sum = 0;

while @fib[$counter] <= 4000000 {
  if (@fib[$counter] % 2 == 0) {
    #print "Adding @fib[$counter]\n";
    $sum += @fib[$counter];
  }
  $counter++;
}

print "$sum\n";
