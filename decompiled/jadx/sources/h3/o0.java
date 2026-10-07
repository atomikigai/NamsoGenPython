package h3;

import android.content.DialogInterface;
import android.widget.Toast;
import app.namso_gen.spacehowen.NotificationHistoryActivity;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4791b;

    public /* synthetic */ o0(Object obj, int i) {
        this.f4790a = i;
        this.f4791b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i10 = this.f4790a;
        int i11 = 2;
        Object obj = this.f4791b;
        switch (i10) {
            case 0:
                e1 e1Var = (e1) obj;
                dialogInterface.dismiss();
                Toast.makeText(e1Var.U(), e1Var.v(R.string.operation_cancelled), 0).show();
                break;
            case 1:
                NotificationHistoryActivity notificationHistoryActivity = (NotificationHistoryActivity) obj;
                int i12 = NotificationHistoryActivity.O;
                rc.b0.q(androidx.lifecycle.i0.e(notificationHistoryActivity), null, new d2(notificationHistoryActivity, null, i11), 3);
                break;
            case 2:
                ((l3.y) obj).j0();
                break;
            default:
                android.support.v4.media.session.a.y((androidx.fragment.app.w) obj, new i2.c(2));
                break;
        }
    }
}
