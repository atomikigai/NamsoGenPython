package z;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10852a;

    public o(Context context) {
        super(context);
        this.f10852a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z4) {
        this.f10852a = z4;
    }

    public void setGuidelineBegin(int i) {
        d dVar = (d) getLayoutParams();
        if (this.f10852a && dVar.f10725a == i) {
            return;
        }
        dVar.f10725a = i;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i) {
        d dVar = (d) getLayoutParams();
        if (this.f10852a && dVar.f10727b == i) {
            return;
        }
        dVar.f10727b = i;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f10) {
        d dVar = (d) getLayoutParams();
        if (this.f10852a && dVar.f10729c == f10) {
            return;
        }
        dVar.f10729c = f10;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
