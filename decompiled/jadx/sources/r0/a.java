package r0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f8105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8106c;

    public a(int i, l lVar, int i10) {
        this.f8104a = i;
        this.f8105b = lVar;
        this.f8106c = i10;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f8104a);
        this.f8105b.f8119a.performAction(this.f8106c, bundle);
    }
}
