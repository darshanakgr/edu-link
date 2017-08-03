package edu.sliit.edulink.tutoral;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import edu.sliit.edulink.tutoral.gradethree.english.activity.GradeThreeEngTutorialOne;

/**
 * Created by drox2014 on 8/2/2017.
 */

public class AlertDialogBuilder {
    public static AlertDialog getWrongAnswerDialog(AppCompatActivity activity){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle("Wrong Answer");
        builder.setMessage("Please try again");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }
}
