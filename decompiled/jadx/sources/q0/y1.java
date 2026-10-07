package q0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class y1 extends x1 {
    public y1(d2 d2Var, WindowInsets windowInsets) {
        super(d2Var, windowInsets);
    }

    @Override // q0.b2
    public d2 a() {
        return d2.g(null, this.f7959c.consumeDisplayCutout());
    }

    @Override // q0.b2
    public k e() {
        DisplayCutout displayCutout = this.f7959c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new k(displayCutout);
    }

    @Override // q0.w1, q0.b2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Objects.equals(this.f7959c, y1Var.f7959c) && Objects.equals(this.f7962g, y1Var.f7962g);
    }

    @Override // q0.b2
    public int hashCode() {
        return this.f7959c.hashCode();
    }
}
