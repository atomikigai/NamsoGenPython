package h3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import app.namso_gen.spacehowen.NotificationHistoryActivity;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b2 implements ic.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NotificationHistoryActivity f4633b;

    public /* synthetic */ b2(NotificationHistoryActivity notificationHistoryActivity, int i) {
        this.f4632a = i;
        this.f4633b = notificationHistoryActivity;
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        int i = this.f4632a;
        ub.k kVar = ub.k.f9073a;
        NotificationHistoryActivity notificationHistoryActivity = this.f4633b;
        i3.o oVar = (i3.o) obj;
        switch (i) {
            case 0:
                int i10 = NotificationHistoryActivity.O;
                jc.i.e(oVar, "item");
                notificationHistoryActivity.getClass();
                String str = oVar.f5194d;
                if (str != null && str.length() != 0) {
                    notificationHistoryActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
                break;
            default:
                int i11 = NotificationHistoryActivity.O;
                jc.i.e(oVar, "item");
                ea.j jVar = new ea.j((Context) notificationHistoryActivity, R.style.MyDialogTheme);
                String string = notificationHistoryActivity.getString(R.string.notification_delete_confirm_title);
                g.b bVar = (g.b) jVar.f3530b;
                bVar.f3971d = string;
                bVar.f3972f = notificationHistoryActivity.getString(R.string.notification_delete_confirm_message);
                jVar.k(notificationHistoryActivity.getString(R.string.btn_delete), new e(1, notificationHistoryActivity, oVar));
                jVar.h(notificationHistoryActivity.getString(R.string.btn_cancel), null);
                g.f fVarA = jVar.a();
                fVarA.setOnShowListener(new f(fVarA, 3));
                fVarA.show();
                break;
        }
        return kVar;
    }
}
