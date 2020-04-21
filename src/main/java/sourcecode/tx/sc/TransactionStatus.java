package sourcecode.tx.sc;

import java.io.Flushable;
import org.springframework.transaction.SavepointManager;

public interface TransactionStatus extends SavepointManager, Flushable {

    boolean isNewTransaction();

    boolean hasSavepoint();

    void setRollbackOnly();

    boolean isRollbackOnly();

    @Override
    void flush();

    boolean isCompleted();

}