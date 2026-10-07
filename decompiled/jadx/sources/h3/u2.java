package h3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import app.namso_gen.spacehowen.MainActivity;
import app.namso_gen.spacehowen.R;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public EditText f4857f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Button f4858g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ProgressBar f4859h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public TextView f4860i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public EditText f4861j0;
    public Button k0;

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_shorten_url, viewGroup, false);
        this.f4857f0 = (EditText) viewInflate.findViewById(R.id.inputUrl);
        this.f4858g0 = (Button) viewInflate.findViewById(R.id.btnShorten);
        this.k0 = (Button) viewInflate.findViewById(R.id.btnCopy);
        this.f4859h0 = (ProgressBar) viewInflate.findViewById(R.id.loader);
        this.f4860i0 = (TextView) viewInflate.findViewById(R.id.resultTitle);
        this.f4861j0 = (EditText) viewInflate.findViewById(R.id.resultUrl);
        Button button = this.f4858g0;
        if (button == null) {
            jc.i.i("btnShorten");
            throw null;
        }
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: h3.t2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u2 f4851b;

            {
                this.f4851b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                switch (i) {
                    case 0:
                        u2 u2Var = this.f4851b;
                        EditText editText = u2Var.f4857f0;
                        if (editText == null) {
                            jc.i.i("inputUrl");
                            throw null;
                        }
                        Editable text = editText.getText();
                        String string2 = (text == null || (string = text.toString()) == null) ? null : pc.g.B0(string).toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        if (string2.length() == 0) {
                            Toast.makeText(u2Var.U(), u2Var.v(R.string.error_enter_url), 0).show();
                            return;
                        }
                        if (!pc.o.e0(string2, "http://", false) && !pc.o.e0(string2, "https://", false)) {
                            Toast.makeText(u2Var.U(), u2Var.v(R.string.error_invalid_url), 0).show();
                            return;
                        }
                        ProgressBar progressBar = u2Var.f4859h0;
                        if (progressBar == null) {
                            jc.i.i("loader");
                            throw null;
                        }
                        progressBar.setVisibility(0);
                        Button button2 = u2Var.f4858g0;
                        if (button2 == null) {
                            jc.i.i("btnShorten");
                            throw null;
                        }
                        button2.setEnabled(false);
                        TextView textView = u2Var.f4860i0;
                        if (textView == null) {
                            jc.i.i("resultTitle");
                            throw null;
                        }
                        textView.setVisibility(8);
                        EditText editText2 = u2Var.f4861j0;
                        if (editText2 == null) {
                            jc.i.i("resultUrl");
                            throw null;
                        }
                        editText2.setVisibility(8);
                        Button button3 = u2Var.k0;
                        if (button3 == null) {
                            jc.i.i("btnCopy");
                            throw null;
                        }
                        button3.setVisibility(8);
                        c cVar = new c(u2Var, 2);
                        com.bumptech.glide.d.v(u2Var.U()).a(new r3.e(1, "https://link.spacehowen.com/api/shorten", new JSONObject().put("url", string2), new e5.c(12, u2Var, cVar), new a5.a(cVar, 14)));
                        androidx.fragment.app.w wVarT = u2Var.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                            return;
                        }
                        return;
                    default:
                        u2 u2Var2 = this.f4851b;
                        androidx.fragment.app.w wVarG = u2Var2.g();
                        Object systemService = wVarG != null ? wVarG.getSystemService("clipboard") : null;
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ClipboardManager clipboardManager = (ClipboardManager) systemService;
                        String strV = u2Var2.v(R.string.clipboard_shorten_url);
                        EditText editText3 = u2Var2.f4861j0;
                        if (editText3 == null) {
                            jc.i.i("resultUrl");
                            throw null;
                        }
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(strV, editText3.getText().toString()));
                        Toast.makeText(u2Var2.U(), u2Var2.v(R.string.url_copied), 0).show();
                        return;
                }
            }
        });
        Button button2 = this.k0;
        if (button2 == null) {
            jc.i.i("btnCopy");
            throw null;
        }
        final int i10 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: h3.t2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ u2 f4851b;

            {
                this.f4851b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                switch (i10) {
                    case 0:
                        u2 u2Var = this.f4851b;
                        EditText editText = u2Var.f4857f0;
                        if (editText == null) {
                            jc.i.i("inputUrl");
                            throw null;
                        }
                        Editable text = editText.getText();
                        String string2 = (text == null || (string = text.toString()) == null) ? null : pc.g.B0(string).toString();
                        if (string2 == null) {
                            string2 = "";
                        }
                        if (string2.length() == 0) {
                            Toast.makeText(u2Var.U(), u2Var.v(R.string.error_enter_url), 0).show();
                            return;
                        }
                        if (!pc.o.e0(string2, "http://", false) && !pc.o.e0(string2, "https://", false)) {
                            Toast.makeText(u2Var.U(), u2Var.v(R.string.error_invalid_url), 0).show();
                            return;
                        }
                        ProgressBar progressBar = u2Var.f4859h0;
                        if (progressBar == null) {
                            jc.i.i("loader");
                            throw null;
                        }
                        progressBar.setVisibility(0);
                        Button button3 = u2Var.f4858g0;
                        if (button3 == null) {
                            jc.i.i("btnShorten");
                            throw null;
                        }
                        button3.setEnabled(false);
                        TextView textView = u2Var.f4860i0;
                        if (textView == null) {
                            jc.i.i("resultTitle");
                            throw null;
                        }
                        textView.setVisibility(8);
                        EditText editText2 = u2Var.f4861j0;
                        if (editText2 == null) {
                            jc.i.i("resultUrl");
                            throw null;
                        }
                        editText2.setVisibility(8);
                        Button button4 = u2Var.k0;
                        if (button4 == null) {
                            jc.i.i("btnCopy");
                            throw null;
                        }
                        button4.setVisibility(8);
                        c cVar = new c(u2Var, 2);
                        com.bumptech.glide.d.v(u2Var.U()).a(new r3.e(1, "https://link.spacehowen.com/api/shorten", new JSONObject().put("url", string2), new e5.c(12, u2Var, cVar), new a5.a(cVar, 14)));
                        androidx.fragment.app.w wVarT = u2Var.T();
                        MainActivity mainActivity = wVarT instanceof MainActivity ? (MainActivity) wVarT : null;
                        if (mainActivity != null) {
                            mainActivity.z();
                            return;
                        }
                        return;
                    default:
                        u2 u2Var2 = this.f4851b;
                        androidx.fragment.app.w wVarG = u2Var2.g();
                        Object systemService = wVarG != null ? wVarG.getSystemService("clipboard") : null;
                        jc.i.c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ClipboardManager clipboardManager = (ClipboardManager) systemService;
                        String strV = u2Var2.v(R.string.clipboard_shorten_url);
                        EditText editText3 = u2Var2.f4861j0;
                        if (editText3 == null) {
                            jc.i.i("resultUrl");
                            throw null;
                        }
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(strV, editText3.getText().toString()));
                        Toast.makeText(u2Var2.U(), u2Var2.v(R.string.url_copied), 0).show();
                        return;
                }
            }
        });
        return viewInflate;
    }
}
