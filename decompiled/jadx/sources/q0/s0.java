package q0;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f7940a;

    public s0(u uVar) {
        this.f7940a = uVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        i iVar = new i(new e(contentInfo));
        i iVarA = ((u0.t) this.f7940a).a(view, iVar);
        if (iVarA == null) {
            return null;
        }
        return iVarA == iVar ? contentInfo : iVarA.a();
    }
}
