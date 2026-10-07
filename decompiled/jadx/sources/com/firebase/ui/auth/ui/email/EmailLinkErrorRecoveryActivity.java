package com.firebase.ui.auth.ui.email;

import android.os.Bundle;
import app.namso_gen.spacehowen.R;
import u4.a;
import w4.d;
import w4.e;
import w4.h;
import w4.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class EmailLinkErrorRecoveryActivity extends a implements h, d {
    @Override // u4.g
    public final void b() {
        throw new UnsupportedOperationException("Fragments must handle progress updates.");
    }

    @Override // u4.g
    public final void i(int i) {
        throw new UnsupportedOperationException("Fragments must handle progress updates.");
    }

    @Override // u4.a, androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fui_activity_register_email);
        if (bundle != null) {
            return;
        }
        y(getIntent().getIntExtra("com.firebase.ui.auth.ui.email.recoveryTypeKey", -1) == 116 ? new e() : new i(), "EmailLinkPromptEmailFragment", false, false);
    }
}
