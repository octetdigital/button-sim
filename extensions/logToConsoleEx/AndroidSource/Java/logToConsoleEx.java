/****************************************************************************************************************************
 * 
 * logToConsoleEx
 * 
 * logToConsoleEx permits you to log to the Game Maker Android console from your GM code,
 * under the "yoyo" tag.
 * 
 * logToConsoleEx is intended as extension for Game Maker Studio Pro v1.3+
 * to be used into your Android project.
 * This is just the Java file, to make this work into your Game Maker game, you need to properly setup your
 * project.
 * 
 * Just call logToConsole("your string") from your Game Maker project.
 *
 * Author: Mattia Fortunati
 * Contact: mattia@mattiafortunati.com
 * Website: http://www.mattiafortunati.com
 * 
 ****************************************************************************************************************************/

package ${YYAndroidPackageName};
//
import android.util.Log;
import java.lang.String;
//
import ${YYAndroidPackageName}.R;
import com.yoyogames.runner.RunnerJNILib;

public class logToConsoleEx
{
    //call this function
    //str is the string you want to log to the console
    public void logToConsole(String str)
	{
		Log.i("yoyo", str);
	}

}