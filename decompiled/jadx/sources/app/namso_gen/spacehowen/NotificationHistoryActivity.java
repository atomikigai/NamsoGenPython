package app.namso_gen.spacehowen;

import a2.d;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.o;
import androidx.lifecycle.i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.NotificationHistoryActivity;
import app.namso_gen.spacehowen.R;
import g.g;
import h3.b2;
import h3.d2;
import h3.g2;
import rc.b0;
import ub.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationHistoryActivity extends g {
    public static final /* synthetic */ int O = 0;
    public RecyclerView K;
    public TextView L;
    public g2 M;
    public final i N = new i(new d(this, 4));

    @Override // androidx.fragment.app.w, androidx.activity.m, d0.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.a(this);
        setContentView(R.layout.activity_notification_history);
        this.K = (RecyclerView) findViewById(R.id.recyclerNotifications);
        this.L = (TextView) findViewById(R.id.textNotificationsEmpty);
        this.M = new g2(new b2(this, 0), new b2(this, 1));
        RecyclerView recyclerView = this.K;
        yb.d dVar = null;
        if (recyclerView == null) {
            jc.i.i("recyclerView");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = this.K;
        if (recyclerView2 == null) {
            jc.i.i("recyclerView");
            throw null;
        }
        g2 g2Var = this.M;
        if (g2Var == null) {
            jc.i.i("adapter");
            throw null;
        }
        recyclerView2.setAdapter(g2Var);
        final int i = 0;
        ((ImageView) findViewById(R.id.btnBack)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.c2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationHistoryActivity f4649b;

            {
                this.f4649b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i10 = i;
                NotificationHistoryActivity notificationHistoryActivity = this.f4649b;
                switch (i10) {
                    case 0:
                        int i11 = NotificationHistoryActivity.O;
                        notificationHistoryActivity.finish();
                        break;
                    default:
                        int i12 = NotificationHistoryActivity.O;
                        ea.j jVar = new ea.j((Context) notificationHistoryActivity, R.style.MyDialogTheme);
                        String string = notificationHistoryActivity.getString(R.string.notification_clear_all_title);
                        g.b bVar = (g.b) jVar.f3530b;
                        bVar.f3971d = string;
                        bVar.f3972f = notificationHistoryActivity.getString(R.string.notification_clear_all_message);
                        jVar.k(notificationHistoryActivity.getString(R.string.notification_clear_all), new o0(notificationHistoryActivity, 1));
                        jVar.h(notificationHistoryActivity.getString(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 2));
                        fVarA.show();
                        break;
                }
            }
        });
        final int i10 = 1;
        ((TextView) findViewById(R.id.btnClearAll)).setOnClickListener(new View.OnClickListener(this) { // from class: h3.c2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NotificationHistoryActivity f4649b;

            {
                this.f4649b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                NotificationHistoryActivity notificationHistoryActivity = this.f4649b;
                switch (i11) {
                    case 0:
                        int i12 = NotificationHistoryActivity.O;
                        notificationHistoryActivity.finish();
                        break;
                    default:
                        int i13 = NotificationHistoryActivity.O;
                        ea.j jVar = new ea.j((Context) notificationHistoryActivity, R.style.MyDialogTheme);
                        String string = notificationHistoryActivity.getString(R.string.notification_clear_all_title);
                        g.b bVar = (g.b) jVar.f3530b;
                        bVar.f3971d = string;
                        bVar.f3972f = notificationHistoryActivity.getString(R.string.notification_clear_all_message);
                        jVar.k(notificationHistoryActivity.getString(R.string.notification_clear_all), new o0(notificationHistoryActivity, 1));
                        jVar.h(notificationHistoryActivity.getString(R.string.btn_cancel), null);
                        g.f fVarA = jVar.a();
                        fVarA.setOnShowListener(new f(fVarA, 2));
                        fVarA.show();
                        break;
                }
            }
        });
        b0.q(i0.e(this), null, new d2(this, dVar, 0), 3);
        b0.q(i0.e(this), null, new d2(this, dVar, 1), 3);
    }
}
