package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import l.d3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2432b;

    public /* synthetic */ l(Object obj, int i) {
        this.f2431a = i;
        this.f2432b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f2431a) {
            case 0:
                m mVar = (m) this.f2432b;
                int i = mVar.f2436j0;
                if (i == 2) {
                    mVar.c0(1);
                } else if (i == 1) {
                    mVar.c0(2);
                }
                break;
            case 1:
                g.e eVar = (g.e) this.f2432b;
                if (view == eVar.i && (message3 = eVar.f4000k) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != eVar.f4001l || (message2 = eVar.f4003n) == null) {
                    messageObtain = (view != eVar.f4004o || (message = eVar.f4006q) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                eVar.E.obtainMessage(1, eVar.f3994b).sendToTarget();
                break;
            case 2:
                g6.i iVar = (g6.i) this.f2432b;
                iVar.G = 2;
                iVar.f4196a.finish();
                break;
            case 3:
                ((j.a) this.f2432b).a();
                break;
            default:
                d3 d3Var = ((Toolbar) this.f2432b).W;
                k.n nVar = d3Var == null ? null : d3Var.f6258b;
                if (nVar != null) {
                    nVar.collapseActionView();
                }
                break;
        }
    }
}
