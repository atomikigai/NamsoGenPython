package b5;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.URLSpan;
import android.view.View;
import app.namso_gen.spacehowen.R;
import e0.k;
import fd.e;
import h6.o0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o0 f1405c;

    public d(Context context, String str) {
        super(str);
        this.f1403a = new WeakReference(context);
        this.f1404b = str;
        int iP = com.bumptech.glide.c.p(context, R.attr.colorSurface, k.getColor(context, R.color.design_default_color_primary));
        e eVar = new e();
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", iP | (-16777216));
        eVar.e = bundle;
        ((Intent) eVar.f3912b).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        this.f1405c = eVar.b();
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context context = (Context) this.f1403a.get();
        if (context != null) {
            this.f1405c.l(context, Uri.parse(this.f1404b));
        }
    }
}
