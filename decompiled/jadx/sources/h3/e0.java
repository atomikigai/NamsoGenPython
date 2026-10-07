package h3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends androidx.fragment.app.s {
    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_generate_password, viewGroup, false);
        Button button = (Button) viewInflate.findViewById(R.id.generarBtn);
        Button button2 = (Button) viewInflate.findViewById(R.id.copiarBtn);
        TextView textView = (TextView) viewInflate.findViewById(R.id.contrasenaTxt);
        EditText editText = (EditText) viewInflate.findViewById(R.id.longitudInput);
        button2.setVisibility(8);
        editText.setText("12");
        button.setOnClickListener(new k(editText, this, textView, button2));
        button2.setOnClickListener(new d0(0, textView, this));
        return viewInflate;
    }
}
