///LoadData(type, key)

var _var;

ini_open( 'savedata.dat' );
if(argument[0] == 'real')
    _var = ini_read_real( 'data', argument[1], 0 );
else
    _var = ini_read_string( 'data', argument[1], undefined);
ini_close(); 

return _var;
