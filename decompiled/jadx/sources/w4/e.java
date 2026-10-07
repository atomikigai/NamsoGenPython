package w4;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.firebase.ui.auth.ui.email.EmailLinkErrorRecoveryActivity;
import com.google.android.gms.common.internal.i0;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class e extends u4.b implements View.OnClickListener {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public d f9606g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public ProgressBar f9607h0;

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fui_email_link_cross_device_linking, viewGroup, false);
    }

    @Override // androidx.fragment.app.s
    public final void M(Bundle bundle, View view) {
        String string;
        this.f9607h0 = (ProgressBar) view.findViewById(R.id.top_progress_bar);
        ((Button) view.findViewById(R.id.button_continue)).setOnClickListener(this);
        String str = this.f8855f0.w().f8400s;
        i0.e(str);
        HashMap mapT = android.support.v4.media.session.a.t(Uri.parse(str));
        if (mapT.isEmpty()) {
            throw new IllegalArgumentException("Invalid link: no parameters found");
        }
        String str2 = (String) mapT.get("ui_pid");
        str2.getClass();
        switch (str2) {
            case "twitter.com":
                string = r4.e.f8156g.getString(R.string.fui_idp_name_twitter);
                break;
            case "google.com":
                string = r4.e.f8156g.getString(R.string.fui_idp_name_google);
                break;
            case "facebook.com":
                string = r4.e.f8156g.getString(R.string.fui_idp_name_facebook);
                break;
            case "phone":
                string = r4.e.f8156g.getString(R.string.fui_idp_name_phone);
                break;
            case "password":
            case "emailLink":
                string = r4.e.f8156g.getString(R.string.fui_idp_name_email);
                break;
            case "github.com":
                string = r4.e.f8156g.getString(R.string.fui_idp_name_github);
                break;
            default:
                string = null;
                break;
        }
        TextView textView = (TextView) view.findViewById(R.id.cross_device_linking_body);
        String strW = w(R.string.fui_email_link_cross_device_linking_text, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strW);
        android.support.v4.media.session.a.b(spannableStringBuilder, strW, string);
        textView.setText(spannableStringBuilder);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
        com.bumptech.glide.c.Q(U(), this.f8855f0.w(), (TextView) view.findViewById(R.id.email_footer_tos_and_pp_text));
    }

    @Override // u4.g
    public final void b() {
        this.f9607h0.setVisibility(4);
    }

    @Override // u4.g
    public final void i(int i) {
        this.f9607h0.setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.button_continue) {
            EmailLinkErrorRecoveryActivity emailLinkErrorRecoveryActivity = (EmailLinkErrorRecoveryActivity) this.f9606g0;
            emailLinkErrorRecoveryActivity.getClass();
            emailLinkErrorRecoveryActivity.y(new i(), "CrossDeviceFragment", true, true);
        }
    }

    @Override // androidx.fragment.app.s
    public final void z(Bundle bundle) {
        this.N = true;
        androidx.lifecycle.h hVarG = g();
        if (!(hVarG instanceof d)) {
            throw new IllegalStateException("Activity must implement EmailLinkPromptEmailListener");
        }
        this.f9606g0 = (d) hVarG;
    }
}
