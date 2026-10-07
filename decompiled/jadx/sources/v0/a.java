package v0;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import l.x2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x2 f9105a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(x2 x2Var) {
        super(new Handler());
        this.f9105a = x2Var;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        return true;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4) {
        Cursor cursor;
        x2 x2Var = this.f9105a;
        if (!x2Var.f9107b || (cursor = x2Var.f9108c) == null || cursor.isClosed()) {
            return;
        }
        x2Var.f9106a = x2Var.f9108c.requery();
    }
}
