

my @b = ( "123" , "123" , "123" );

for ( 1 .. 5000000 ) {
    my $a = join( ',', @b );
}
