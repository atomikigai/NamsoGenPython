package h3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public LinearProgressIndicator f4702f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public TextView f4703g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TextView f4704h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Button f4705i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public EditText f4706j0;
    public ProgressBar k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public LinearLayout f4707l0;

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ip_check, viewGroup, false);
        this.f4702f0 = (LinearProgressIndicator) viewInflate.findViewById(R.id.scoreBar);
        this.f4703g0 = (TextView) viewInflate.findViewById(R.id.scoreBigTextView);
        this.f4704h0 = (TextView) viewInflate.findViewById(R.id.riskTextView);
        this.f4705i0 = (Button) viewInflate.findViewById(R.id.checkFraudButton);
        this.f4706j0 = (EditText) viewInflate.findViewById(R.id.ipDetailsEditText);
        this.k0 = (ProgressBar) viewInflate.findViewById(R.id.loader);
        this.f4707l0 = (LinearLayout) viewInflate.findViewById(R.id.LayoutResult);
        Button button = this.f4705i0;
        if (button != null) {
            button.setOnClickListener(new com.google.android.material.datepicker.n(this, 7));
            return viewInflate;
        }
        jc.i.i("checkFraudButton");
        throw null;
    }
}
