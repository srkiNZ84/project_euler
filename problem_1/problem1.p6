#!/usr/local/bin/perl6

my $sum = 0;
for 1..999 {
  if ($_ % 3 == 0 || $_ % 5 == 0) {
    #print "Adding $_ to sum\n";
    $sum += $_;
  }
}

print "Final sum is: $sum\n";
