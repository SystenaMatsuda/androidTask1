package com.example.matsudakei.android_task1;

/**
 * Created by matsudakei on 2019/05/09.
 */

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.DialogFragment;
import android.widget.Toast;

public class CustomDialogFragment extends DialogFragment {
    // ダイアログが生成された時に呼ばれるメソッド ※必須
    public Dialog onCreateDialog(Bundle savedInstanceState){
        // ダイアログ生成  AlertDialogのBuilderクラスを指定してインスタンス化します
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(getActivity());
        // タイトル設定
        dialogBuilder.setTitle("ドロイド君より");
        // 表示する文章設定
        dialogBuilder.setMessage("今からアプリを起動してもいいですか？");

        // OKボタン作成
        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // トーストを出す
                Toast toast = Toast.makeText(getActivity(), "OK", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // キャンセルボタン作成
        dialogBuilder.setNegativeButton("キャンセル", new DialogInterface.OnClickListener(){

            @Override
            public void onClick(DialogInterface dialog, int which) {
                // トーストを出す
                Toast toast = Toast.makeText(getActivity(), "キャンセル", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        // dialogBuilderを返す
        return dialogBuilder.create();
    }
}
