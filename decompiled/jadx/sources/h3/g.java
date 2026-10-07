package h3;

import android.content.DialogInterface;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import com.firebase.ui.auth.ui.email.EmailLinkCatcherActivity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g.g f4701c;

    public /* synthetic */ g(g.g gVar, int i, int i10) {
        this.f4699a = i10;
        this.f4701c = gVar;
        this.f4700b = i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i10 = this.f4699a;
        int i11 = this.f4700b;
        g.g gVar = this.f4701c;
        switch (i10) {
            case 0:
                CheckerHistoryActivity checkerHistoryActivity = (CheckerHistoryActivity) gVar;
                int i12 = CheckerHistoryActivity.Q;
                rc.b0.q(androidx.lifecycle.i0.e(checkerHistoryActivity), null, new j(i11, checkerHistoryActivity, null), 3);
                break;
            default:
                int i13 = EmailLinkCatcherActivity.P;
                ((EmailLinkCatcherActivity) gVar).u(null, i11);
                break;
        }
    }
}
