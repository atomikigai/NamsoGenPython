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
public final class i2 extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public EditText f4730f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public Button f4731g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public EditText f4732h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public ProgressBar f4733i0;

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_search_bin_db, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        jc.i.e(view, "view");
        this.f4730f0 = (EditText) view.findViewById(R.id.searchBinEditText);
        this.f4731g0 = (Button) view.findViewById(R.id.searchBinButton);
        this.f4732h0 = (EditText) view.findViewById(R.id.searchResultEditText);
        this.f4733i0 = (ProgressBar) view.findViewById(R.id.searchProgressBar);
        Button button = this.f4731g0;
        if (button != null) {
            button.setOnClickListener(new com.google.android.material.datepicker.n(this, 12));
        } else {
            jc.i.i("searchBinButton");
            throw null;
        }
    }
}
