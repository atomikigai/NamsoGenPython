package com.firebase.ui.auth.ui.email;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import r4.i;
import s4.c;
import u4.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class WelcomeBackEmailLinkPrompt extends a implements View.OnClickListener {
    public static final /* synthetic */ int O = 0;
    public i L;
    public Button M;
    public ProgressBar N;

    @Override // u4.g
    public final void b() {
        this.N.setEnabled(true);
        this.N.setVisibility(4);
    }

    @Override // u4.g
    public final void i(int i) {
        this.M.setEnabled(false);
        this.N.setVisibility(0);
    }

    @Override // u4.c, androidx.fragment.app.w, androidx.activity.m, android.app.Activity
    public final void onActivityResult(int i, int i10, Intent intent) {
        super.onActivityResult(i, i10, intent);
        u(intent, i10);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.button_sign_in) {
            c cVarW = w();
            i iVar = this.L;
            startActivityForResult(u4.c.t(this, EmailActivity.class, cVarW).putExtra("extra_email", iVar.c()).putExtra("extra_idp_response", iVar), 112);
        }
    }

    @Override // u4.a, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_welcome_back_email_link_prompt_layout);
        this.L = i.b(getIntent());
        this.M = (Button) findViewById(R.id.button_sign_in);
        this.N = (ProgressBar) findViewById(R.id.top_progress_bar);
        TextView textView = (TextView) findViewById(R.id.welcome_back_email_link_body);
        String string = getString(R.string.fui_welcome_back_email_link_prompt_body, this.L.c(), this.L.e());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        android.support.v4.media.session.a.b(spannableStringBuilder, string, this.L.c());
        android.support.v4.media.session.a.b(spannableStringBuilder, string, this.L.e());
        textView.setText(spannableStringBuilder);
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setJustificationMode(1);
        }
        this.M.setOnClickListener(this);
        com.bumptech.glide.c.Q(this, w(), (TextView) findViewById(R.id.email_footer_tos_and_pp_text));
    }
}
