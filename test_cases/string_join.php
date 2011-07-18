<?php
$a = array('123','abc','abc');
for( $i = 0; $i < 5000000 ; $i++ )
    $b = join(',',$a);
?>
