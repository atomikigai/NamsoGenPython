package d6;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzavc;
import l.c2;
import l.y;
import l.z1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2965b;

    public /* synthetic */ l(Object obj, int i) {
        this.f2964a = i;
        this.f2965b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f2964a) {
            case 0:
                zzavc zzavcVar = ((o) this.f2965b).f2975s;
                if (zzavcVar != null) {
                    zzavcVar.zzd(motionEvent);
                }
                break;
            default:
                c2 c2Var = (c2) this.f2965b;
                z1 z1Var = c2Var.C;
                Handler handler = c2Var.G;
                y yVar = c2Var.K;
                int action = motionEvent.getAction();
                int x4 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x4 >= 0 && x4 < yVar.getWidth() && y10 >= 0 && y10 < yVar.getHeight()) {
                    handler.postDelayed(z1Var, 250L);
                } else if (action == 1) {
                    handler.removeCallbacks(z1Var);
                }
                break;
        }
        return false;
    }
}
