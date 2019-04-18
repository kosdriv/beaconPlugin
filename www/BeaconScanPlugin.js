var exec = require('cordova/exec');

exports.bservice = function (arg0, success, error) {
    console.log(arg0);
    if(arg0 == "start") {
        console.log("executing bservice start");
        exec(success, error, 'BeaconScanPlugin', 'startService', [arg0]);
    }
    else if(arg0 == "stop")
    {
        console.log("executing bservice stop");
        exec(success, error, 'BeaconScanPlugin', 'stopService', [arg0]);
    }
    
};

