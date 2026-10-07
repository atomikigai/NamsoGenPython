package h3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public EditText f4621f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Button f4622g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public EditText f4623h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ProgressBar f4624i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public fa.w f4625j0;

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_bin_checker, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        jc.i.e(view, "view");
        this.f4621f0 = (EditText) view.findViewById(R.id.binEditText);
        this.f4622g0 = (Button) view.findViewById(R.id.checkBinButton);
        this.f4623h0 = (EditText) view.findViewById(R.id.resultEditText);
        this.f4624i0 = (ProgressBar) view.findViewById(R.id.progressBar);
        this.f4625j0 = com.bumptech.glide.d.v(U());
        ProgressBar progressBar = this.f4624i0;
        if (progressBar == null) {
            jc.i.i("progressBar");
            throw null;
        }
        progressBar.setVisibility(8);
        EditText editText = this.f4623h0;
        if (editText == null) {
            jc.i.i("resultEditText");
            throw null;
        }
        editText.setVisibility(8);
        Button button = this.f4622g0;
        if (button != null) {
            button.setOnClickListener(new com.google.android.material.datepicker.n(this, 4));
        } else {
            jc.i.i("checkBinButton");
            throw null;
        }
    }
}
