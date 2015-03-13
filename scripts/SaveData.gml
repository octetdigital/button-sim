///SaveData(key,value)



ini_open("savedata.dat");
if(is_real(argument[1])) {
    ini_write_real( 'data', argument[0], argument[1] );
} else {
    ini_write_string( 'data', argument[0], argument[1] );
}
ini_close(); 