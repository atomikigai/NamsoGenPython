package g6;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageButton f4224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f4225b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.content.Context r7, g6.n r8, g6.i r9) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.o.<init>(android.content.Context, g6.n, g6.i):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        i iVar = this.f4225b;
        if (iVar != null) {
            iVar.G = 2;
            iVar.f4196a.finish();
        }
    }
}
