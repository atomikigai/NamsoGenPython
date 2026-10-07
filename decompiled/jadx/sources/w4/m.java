package w4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.firebase.ui.auth.ui.email.EmailActivity;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class m extends u4.b implements View.OnClickListener {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public l f9629g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ProgressBar f9630h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f9631i0;

    @Override // androidx.fragment.app.s
    public final void B(Context context) {
        super.B(context);
        androidx.lifecycle.h hVarG = g();
        if (!(hVarG instanceof l)) {
            throw new IllegalStateException("Activity must implement ResendEmailListener");
        }
        this.f9629g0 = (l) hVarG;
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_email_link_trouble_signing_in_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        this.f9630h0 = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        this.f9631i0 = this.f977f.getString("extra_email");
        view.findViewById(R.id.button_resend_email).setOnClickListener(this);
        com.bumptech.glide.c.Q(U(), this.f8855f0.w(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }

    @Override // u4.g
    public final void b() {
        this.f9630h0.setVisibility(4);
    }

    @Override // u4.g
    public final void i(int i) {
        this.f9630h0.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.button_resend_email) {
            l lVar = this.f9629g0;
            String str = this.f9631i0;
            EmailActivity emailActivity = (EmailActivity) lVar;
            ArrayList arrayList = emailActivity.p().f880d;
            if ((arrayList != null ? arrayList.size() : 0) > 0) {
                emailActivity.p().K();
            }
            emailActivity.z(com.bumptech.glide.d.q("emailLink", emailActivity.w().f8395b), str);
        }
    }
}
