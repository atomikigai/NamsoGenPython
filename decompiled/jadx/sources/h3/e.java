package h3;

import android.content.DialogInterface;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.NotificationHistoryActivity;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4665c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f4663a = i;
        this.f4664b = obj;
        this.f4665c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i10 = this.f4663a;
        yb.d dVar = null;
        int i11 = 3;
        Object obj = this.f4665c;
        Object obj2 = this.f4664b;
        switch (i10) {
            case 0:
                CheckerHistoryActivity checkerHistoryActivity = (CheckerHistoryActivity) obj2;
                int i12 = CheckerHistoryActivity.Q;
                rc.b0.q(androidx.lifecycle.i0.e(checkerHistoryActivity), null, new a2.g(checkerHistoryActivity, (i3.a) obj, dVar, i11), 3);
                break;
            case 1:
                NotificationHistoryActivity notificationHistoryActivity = (NotificationHistoryActivity) obj2;
                int i13 = NotificationHistoryActivity.O;
                rc.b0.q(androidx.lifecycle.i0.e(notificationHistoryActivity), null, new a2.g(notificationHistoryActivity, (i3.o) obj, dVar, 12), 3);
                break;
            case 2:
                x2 x2Var = (x2) obj2;
                rc.b0.q(androidx.lifecycle.i0.e(x2Var.x()), null, new a2.g(x2Var, (List) obj, dVar, 16), 3);
                break;
            default:
                ((ic.l) obj2).invoke((n3.b) obj);
                break;
        }
    }
}
